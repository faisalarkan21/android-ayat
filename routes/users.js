var mysql = require('mysql');
var connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'bootcamp_node',

});




connection.connect(function (err) {
    if (err) {
        console.error('error connecting: ' + err.stack);
        return;
    }

    console.log('connected as id ' + connection.threadId);
});


exports.index = function (req,res){

     res.render('index');

}

exports.daftar = function (req, res) {

    res.render('user/daftar');




};


exports.mendaftar = function (req, res, next) {


    var insertPembeli = {

        nm_pembeli: req.body.nama,
        email_pembeli: req.body.email,
        password: req.body.password,
        hp_pembeli: req.body.hp,
        gd_pembeli: req.body.gd,
        motivasi_pembeli: req.body.motivasi


    };

    //masukin nama, hp,gender,email, password

    var query = connection.query("INSERT INTO pembeli set ? ", insertPembeli, function (err, rows) {

        if (err) {
            console.log(err);
            return next("Mysql error, check your query");
        }



    });

    var waktu = new Date();

    console.log(waktu);

    //masukin date
    var query = connection.query("INSERT INTO tgl_pesan set tgl_order = ?", waktu, function (err, rows) {

        if (err) {
            console.log(err);
            return next("Mysql error, check your query");
        }



    });




    var insertDetail = {



        harga_tiket: 500000,
        uang_transfer: 0,
        pilihan_bank: req.body.bank,
        status: "Belum Lunas",



    };

    /*
    console.log(req.body.satuan);
    console.log(namaTiket);
    console.log(req.body.jmlTiket);
    console.log(req.body.totalHarga);

    */

    var query = connection.query("INSERT INTO detil_pesan_tiket set ?", insertDetail, function (err, rows) {

        if (err) {
            console.log(err);
            return next("Mysql error, check your query");
        }




    });



    var insertPembeliValidasi = {

        nm_pembeli: req.body.nama,
        email_pembeli: req.body.email,
        hp_pembeli: req.body.hp,





    };

    var query = connection.query("INSERT INTO pembeli_validasi set ?", insertPembeliValidasi, function (err, rows) {

        if (err) {
            console.log(err);
            return next("Mysql error, check your query");
        }




    });


    res.redirect('/login');

}



exports.login = function (req, res, next) {
    if (req.session.namaSession) {

        res.redirect("profile");

    } else {

        res.render('user/login');

    };
};




exports.membuktikan = function (req, res, next) {



    var query = connection.query("select * from pembeli where email_pembeli = ? ", req.body.email, function (err, data) {



        if (err) {
            console.log(err);
            return next("Mysql error, check your query");
        }


        // console.log(data);


        if (data.length < 1) {

            res.render('user/login', {
                error: "has-error is-empty",
                data: "<label class='control-label' id='error' >Data tidak ada didalam database</label>"
            });

        } else if ((req.body.email === data[0].email_pembeli) && (req.body.password === data[0].password)) {

            req.session.namaSession = data[0].email_pembeli;
            req.session.nomor_pembeli = data[0].id_pembeli;
            req.session.namaPembeli = data[0].nm_pembeli;
            res.redirect('profile');


        } else {

            res.render('user/login', {
                error: "has-error is-empty",
                data: "<label class='control-label' id='error' >Password anda salah</label>"
            });

        }



        // //disini
        // if (!data) {

        //     console.log("kaga sama");
        //     res.render('user/login',{error: "has-error is-empty", data:"<label class='control-label' id='error' >Data anda tidak ada didalam database</label>"});


        // } else if (data.admin == false) {

        //     req.session.namaSession = data.email_pembeli;
        //     req.session.admin = data.admin;
        //     console.log(req.session);
        //     res.send("profile");


        // } else if (data.admin == true) {

        //     console.log("disini admin");
        //     req.session.namaSession = data.name;
        //     req.session.admin = data.admin;

        //     //test
        //     console.log(req.session);

        //     res.redirect('admin/dashboard');

        // }

    });
    // console.log(akun);
};



// bagian validasi

exports.profile = function (req, res) {


    var query = connection.query("select * from pembeli where email_pembeli = ? ", req.session.namaSession, function (err, data) {



        if (err) {
            console.log(err);
            return next("Mysql error, check your query");
        }

        res.render("user/halamanUser/profile", {
            nama: req.session.namaSession,
            namaPembeli: data[0].nm_pembeli
        });

    });
}

exports.validasi = function (req, res) {

    //case looooopp hati2 


    // console.log("hereeeeeeee broh");

    // console.log(req.session.nomor_pembeli);



    var query = connection.query("select * from pembeli where id_pembeli = ? ", req.session.nomor_pembeli, function (err, pembeli) {

        if (err) {
            console.log(err);
            return next("Error Query Level 1, Pembeli ");
        }

        req.session.namaSession = pembeli[0].email_pembeli;

        console.log(pembeli[0]);

        var query2 = connection.query("select * from detil_pesan_tiket where id_pembeli = ?", pembeli[0].id_pembeli, function (err, detail) {


            if (err) {
                console.log(err);
                return next("Error Query Level 2, Detail");
            }


            res.render("user/halamanUser/validasiUser", {
                nama: req.session.namaSession,
                emailUtama: pembeli[0],
                detailPembeli: detail[0]



            });



        })
        //akhir query lapis dua

    });
    // akhir query lapis satu



    // var query = connection.query("select * from pembeli_sekunder where email_utama = ? ", req.session.namaSession, function (err, pembeliSekunder) {

    //     if (err) {
    //         console.log(err);
    //         return next("Error Query Level 1, Pembeli ");
    //     }


    //     console.log(pembeliSekunder);

    //  });
    // akhir dari select sekunder


}




exports.validasiPost = function (req, res) {


    var updateUser = {

        nm_pembeli: req.body.nama,
        email_pembeli: req.body.email,
        hp_pembeli: req.body.hp




    }


    // Masuk Pembeli Utama
    // console.log(updatePembeliUtama);

    var query = connection.query("update pembeli set ? where id_pembeli =  ?", [updateUser, req.session.nomor_pembeli], function (err, rows) {

        if (err) {
            console.log(err);
            return next("Mysql error, check your query");
        }

        console.log("update Bisa !! Utama");

        // req.session.namaSession = rows[0].email_pembeli;



    });



    res.redirect("/user/data");

}


exports.ketentuan = function (req, res) {


    res.render('user/halamanUser/ketentuan');



};



exports.tiket = function (req, res) {


    var query = connection.query("select * from pembeli_validasi where id_pembeli =  ?", req.session.nomor_pembeli, function (err, validasi) {

        if (err) {

            console.log(err);
            return next("Error validasi Level 1, Pembeli ");
        }

        var query1 = connection.query("select * from pembeli where id_pembeli = ? ", req.session.nomor_pembeli, function (err, pembeli) {

            if (err) {
                console.log(err);
                return next("Error Query Level 1, Pembeli ");
            }


            var query2 = connection.query("select * from detil_pesan_tiket where id_pembeli = ?", pembeli[0].id_pembeli, function (err, detail) {


                if (err) {
                    console.log(err);
                    return next("Error Query Level 2, Detail");
                }




                var statusKirim;

                if (validasi[0].uang_transfer_validasi) {

                    statusKirim = true;

                } else {

                    statusKirim = false;

                }






                res.render("user/halamanUser/validasitiket", {
                    nama: req.session.namaSession,
                    emailUtama: pembeli[0],
                    detailTiket: detail[0],
                    validasiTable: validasi[0],
                    statusValidasi: statusKirim
                });

            });
        });

    });


}




exports.keluar = function (req, res) {


    req.session = null;


    res.redirect('/');


};


exports.cobaGet = function (req, res) {


    var nama = req.body.nama;

    res.send("nama lau sadasdasdd " + nama);


}



// Admin

exports.adminLogin = function (req, res) {


    res.render('user/admin/login-admin');


}

exports.adminValidasi = function (req, res) {

    var query = connection.query('select * from admin where email_admin = ?  ', req.body.email, function (err, data) {

        if (err) {
            console.log(err);
            return next("Mysql error, check your query");
        }

        if (data.length < 1) {

            res.render('user/admin/login-admin', {
                error: "has-error is-empty",
                data: "<label class='control-label' id='error' >Data tidak ada didalam database</label>"
            });

        } else if ((req.body.email === data[0].email_admin) && (req.body.password === data[0].pass_admin)) {

            req.session.admin = true;
            req.session.namaSession = data[0].email_admin;
            req.session.nomor_pembeli = data[0].id_admin;
            req.session.namaAdmin = data[0].nm_admin;
            res.redirect('dashboard');


        } else {

            res.render('user/admin/login-admin', {
                error: "has-error is-empty",
                data: "<label class='control-label' id='error' >Password anda salah</label>"
            });

        }



    });
}

//,pembeli_sekunder where email_pembeli = ? 
exports.adminDashboard = function (req, res) {

    var query = connection.query("select COUNT(*) AS tiketCount FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli", function (err, jumlahTiketTerjual) {

        // console.log(jumlahTiketTerjual[0].hitung);

        var query = connection.query("select * FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli limit 60, 18446744073709551615", function (err, pembeliWaiting) {

            var query = connection.query("select * FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli WHERE detil_pesan_tiket.uang_transfer = 500000 limit 60", function (err, Lunas) {


                var query = connection.query("select * FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli WHERE detil_pesan_tiket.uang_transfer = 0 limit 60", function (err, pembeliBelumLunas) {


                    var query = connection.query("SELECT SUM(detil_pesan_tiket.uang_transfer) AS totaltf FROM detil_pesan_tiket LIMIT 60", function (err, totalPendapatan) {

                        var query = connection.query("SELECT SUM(detil_pesan_tiket.harga_tiket) AS totalTiket FROM detil_pesan_tiket LIMIT 60", function (err, totalEstimasiPembeli) {


                             var query = connection.query("select * FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli WHERE pembeli_validasi.uang_transfer_validasi = 500000 limit 60", function (err, validasiTiket) {


                            var totalTiketTersedia = 60 - jumlahTiketTerjual[0].tiketCount;
                            var sisaBelumdibayar = totalEstimasiPembeli[0].totalTiket - totalPendapatan[0].totaltf
                            // var waitingTiket = 0;
                            // waitingTiket =    pembeliWaiting[0].waitingCount;

                            console.log(pembeliWaiting.length);


                            function toRp(angka) {
                                var rev = parseInt(angka, 10).toString().split('').reverse().join('');
                                var rev2 = '';
                                for (var i = 0; i < rev.length; i++) {
                                    rev2 += rev[i];
                                    if ((i + 1) % 3 === 0 && i !== (rev.length - 1)) {
                                        rev2 += '.';
                                    }
                                }
                                return 'Rp. ' + rev2.split('').reverse().join('') + ',00';
                            }





                            res.render('user/admin/dashboard', {
                                email: req.session.namaSession,
                                nama: req.session.namaAdmin,
                                jumlahTiketSold: jumlahTiketTerjual[0].tiketCount,
                                jumlahTiketReady: totalTiketTersedia,
                                waitingTiket: pembeliWaiting.length,
                                tiketLunas: Lunas.length,
                                tiketBelumLunas: pembeliBelumLunas.length,
                                totalPendapatan: toRp(totalPendapatan[0].totaltf),
                                totalEstimasiTIket: toRp(sisaBelumdibayar),
                                jumlahKotakValidasi : validasiTiket.length


                            });

                        });
                             });
                    });
                });

            });

        });


    })







};

exports.semuaUser = function (req, res) {

    var query = connection.query("select * FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli limit 60", function (err, pembeliSemua) {

        console.log(pembeliSemua);




        res.render('user/admin/semua-user', {
            email: req.session.namaSession,
            nama: req.session.namaAdmin,
            dataSemua: pembeliSemua,
            // validasi: pembeliValidasi 

        });





    })





};




exports.userLunas = function (req, res) {

    var query = connection.query("select * FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli WHERE detil_pesan_tiket.uang_transfer = 500000 limit 60", function (err, Lunas) {

        res.render('user/admin/user-lunas', {
            email: req.session.namaSession,
            nama: req.session.namaAdmin,
            userLunas: Lunas
        });
    });

}


exports.userBelumLunas = function (req, res) {

    var query = connection.query("select * FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli WHERE detil_pesan_tiket.uang_transfer = 0 limit 60", function (err, pembeliBelumLunas) {

        res.render('user/admin/user-belum-lunas', {
            email: req.session.namaSession,
            nama: req.session.namaAdmin,
            BelumLunas: pembeliBelumLunas
        });
    });

}

exports.waitingList = function (req, res) {

    var query = connection.query("select * FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli limit 60, 18446744073709551615", function (err, pembeliWaiting) {

        // console.log(pembeliWaiting < 1);

        var pembeliFilterAda, pembeliFilterNull;

        if (pembeliWaiting.length < 1) {

            pembeliFilterNull = "List Kosong Sampai saat ini kouta tiket masih dapat dipenuhi";

        } else {

            pembeliFilterAda = pembeliWaiting;

        }


        console.log(pembeliFilterAda);
        console.log(pembeliFilterNull);

        // if (pembeliSemua > )

        res.render('user/admin/user-waiting', {
            email: req.session.namaSession,
            nama: req.session.namaAdmin,
            pembeliFilterAda: pembeliFilterAda,
            filterNUll: pembeliFilterNull
        });
    });

}


/*

    Tempat /User

*/




exports.userDetail = function (req, res) {

    console.log(req.params.id);
    var query = connection.query("select * FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli WHERE pembeli.id_pembeli = ?", req.params.id, function (err, userDetail) {






        res.render("user/admin/user-detail", {
            userDetail: userDetail[0],
            email: req.session.namaSession,
            nama: req.session.namaAdmin




        });
        // console.log(user_gold);





    });
}


exports.userDetailPost = function (req, res) {


    
    function convertToAngka(rupiah) {
        return parseInt(rupiah.replace(/,.*|[^0-9]/g, ''), 10);
    }


    console.log('disni id ' + req.params.id);
    updateDetail = {


        uang_transfer: convertToAngka(req.body.uangtf)
    }

    console.log(updateDetail);
   

    var query = connection.query("update detil_pesan_tiket set ?  where id_pembeli =  ?", [updateDetail, req.params.id], function (err, data) {
        if (err) {
            console.log(err);
            return next("Mysql error, check your query");
        }
        console.log("Data Masuk");
    });
    
    res.redirect('/admin/dashboard/semua-user');


}






exports.tiketPost = function (req, res) {


    updateValidasi = {


        uang_transfer_validasi: 500000,
        pilihan_bank: req.body.namaBank
    }

    var query = connection.query("update pembeli_validasi set ?  where id_pembeli =  ?", [updateValidasi, req.session.nomor_pembeli], function (err, data) {
        if (err) {
            console.log(err);
            return next("Mysql error, check your query");
        }
        console.log("Data Masuk");
    });
    res.redirect('/user/validasi');
}


//admin kotak validasi 
exports.kotakValidasi = function (req, res) {

    var query = connection.query("select * FROM pembeli INNER JOIN detil_pesan_tiket on pembeli.id_pembeli=detil_pesan_tiket.id_pembeli INNER JOIN pembeli_validasi on detil_pesan_tiket.id_pembeli=pembeli_validasi.id_pembeli WHERE pembeli_validasi.uang_transfer_validasi = 500000 limit 60", function (err, validasi) {

        res.render('user/admin/kotak_validasi', {
            email: req.session.namaSession,
            nama: req.session.namaAdmin,
            userValidasi: validasi
        });
    });

}





exports.detailValidasi = function (req, res) {

    var id = req.params.id;

    var query = connection.query("select * from pembeli_validasi where id_pembeli=?", id, function (err, validasi) {

        if (err) {
            console.log(err);
        }

        var query2 = connection.query("select * from detil_pesan_tiket where id_pembeli=?", id, function (err, detail) {

            if (err) {
                console.log(err);

            }

            res.render("user/admin/detail_validasi", {
                userValidasi: validasi[0],
                detail_tiket: detail[0],
                email: req.session.namaSession,
                nama: req.session.namaAdmin
            });


        });
    });

}



exports.sendEmail = function (req, res) {

    var id = req.params.id;

    var query = connection.query("select * from pembeli_validasi where id_pembeli=?", id, function (err, validasi) {

        if (err) {
            console.log(err);
        }

        var query2 = connection.query("select * from detil_pesan_tiket where id_pembeli=?", id, function (err, detail) {

            if (err) {
                console.log(err);

            }

            function toRp(angka) {
                var rev = parseInt(angka, 10).toString().split('').reverse().join('');
                var rev2 = '';
                for (var i = 0; i < rev.length; i++) {
                    rev2 += rev[i];
                    if ((i + 1) % 3 === 0 && i !== (rev.length - 1)) {
                        rev2 += '.';
                    }
                }
                return 'Rp. ' + rev2.split('').reverse().join('') + ',00';
            }

            res.render("user/admin/send-email", {
                userValidasi: validasi[0],
                detail_tiket: detail[0],
                email: req.session.namaSession,
                nama: req.session.namaAdmin,
                uangRp: toRp(detail[0].uang_transfer)
            });


        });
    });

}


exports.sendEmailAct = function (req, res) {


    // var id = req.params.id;
    console.log(req.body.alamatEmailHost);
    console.log(req.body.contents);
    console.log(req.body.subjek);
    console.log(req.body.emailTujuan);


    var api_key = 'key-fd687b0a68bc8505dfa4eb84605b9033';
    var domain = 'sandbox0e4ae9030dd64b0caaaa32721d188a83.mailgun.org';
    var mailgun = require('mailgun-js')({
        apiKey: api_key,
        domain: domain
    });

    var data = {
        from: req.body.alamatEmailHost,
        to: req.body.emailTujuan,
        subject: req.body.subjek,
        /**/
        html: req.body.contents
    };

    mailgun.messages().send(data, function (error, body) {
        console.log(body);
    });

}

exports.deletePeserta = function (req, res) {


    console.log(req.params.id)


    var query = connection.query("delete from pembeli_validasi where id_pembeli=?", req.params.id, function (err, validasi) {

        if (err) {
            console.log(err);
        }



    });


    var query2 = connection.query("delete from detil_pesan_tiket where id_pembeli=?", req.params.id, function (err, validasi) {

        if (err) {
            console.log(err);
        }

    });


    var query3 = connection.query("delete from tgl_pesan where id_pembeli=?", req.params.id, function (err, validasi) {

        if (err) {
            console.log(err);
        }

    });



    var query4 = connection.query("delete from pembeli where id_pembeli=?", req.params.id, function (err, validasi) {

        if (err) {
            console.log(err);
        }

    });



    res.redirect('admin/dashboard/semua-user');


}




// nexmo.message.sendSms(
//   "Node Bootcamp 2017", req.body.no_hp, 'COba',
//     (err, responseData) => {
//       if (err) {
//         console.log(err);
//       } else {
//         console.dir(responseData);
//       }
//     }
//  );