var express = require('express');
var path = require('path');
var favicon = require('serve-favicon');
var logger = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');
var exphbs = require('express-handlebars');
var assert = require('assert');
var session = require('express-session');
var fs = require('fs');
var http = require('http');
var util = require('util');
var routes = require('./routes/index');
var users = require('./routes/users')
var multer = require('multer');
var handlebars = require("handlebars");
var cookieSession = require('cookie-session')



var app = express()


// helper handlebars
var hbs = exphbs.create({
    // Specify helpers which are only registered on this instance.

    extname: '.html',
    helpers: {
        cekAdmin: function () {
            if (data.admin == true) {

                return "checked";

            } else {

                return "";

            }


        },

        bar: function () {
            return 'BAR!';
        },
        tambahSatu: function (angka) {
            return angka + 2
        },
        tambahSatuAdmin: function (angka) {
            return angka + 1
        },
        atas: function () {

            for (var i = 0; i < 5; i++) {

                return i;

            }
        },
        tiket_user_utama: function (tiket_utama) {


       

            if (tiket_utama == "TK01") {

               return "TK01 - TIKET PREMIUM";

            } else if (tiket_utama == "TK02") {

                return "TK02 - TIKET GOLD";

            } else {

                return "TK03 - TIKET SILVER";

            }

          

        }


    }
});




// exphbs.registerHelper('list', function(items, options) {
//   var out = "<ul>";

//   for(var i=0, l=items.length; i<l; i++) {
//     out = out + "<li>" + options.fn(items[i]) + "</li>";
//   }

//   return out + "</ul>";
// });




// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.engine('.html', hbs.engine);
app.set('view engine', '.html');



// uncomment after placing your favicon in /public
//app.use(favicon(path.join(__dirname, 'public', 'favicon.ico')));
app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({
    extended: false
}));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));
app.use('/tinymce', express.static(__dirname + '/node_modules/tinymce/'));
app.use('/material', express.static(__dirname + '/node_modules/bootstrap-material-design/dist/'));
app.use('/bootstrap', express.static(__dirname + '/node_modules/bootstrap/dist/'));
app.use('/jquery', express.static(__dirname + '/node_modules/jquery/dist/'));
app.use('/handlebars', express.static(__dirname + '/node_modules/handlebars/dist/'));
app.use('/font-material', express.static(__dirname + '/node_modules/material-design-icons/iconfont/'));
app.use('/font-awesome', express.static(__dirname + '/node_modules/font-awesome/'));
app.use('/full-page', express.static(__dirname + '/node_modules/fullpage.js/dist/'));
app.use('/chartist', express.static(__dirname + '/node_modules/chartist/dist/'));
app.use('/chartist', express.static(__dirname + '/node_modules/chartist/dist/'));
app.use('/quill', express.static(__dirname + '/node_modules/quill/dist/'));


// buat session 
app.use(cookieSession({
    name:"session",
    secret: 'somesecrettokenhere'
}));

// buat session jdi globalaaa
app.use(function (req, res, next) {
    res.locals.session = req.session;
    next();
});






/*
  Buat Pengaman gan! 

*/



var udahmasuk = function (req, res, next) {

    // if (req.session.admin == true) {

    //     res.redirect("/admin");

    // } else if (req.session.admin == false && req.session.namaSession) {

    //     res.redirect("/dashboard");

    // } else {

    //     res.render('user/login', {
    //         yeah: "belum login"
    //     });

    // };
};



var pengamananUser = function (req, res, next) {

    console.log(session.namaSession);


    if (!req.session.namaAdmin && req.session.namaSession !== undefined)
        return next();

    res.send("Engga dijinin gan!");
};


var pengamananAdmin = function (req, res, next) {

    if (req.session.admin === true)
        return next();

    res.send("Engga dijinin gan!");
};






/*
  aaAlamat!aa
*/





/*
    Untuk Admin
*/

app.get('/', users.index);
app.get('/admin/login', users.adminLogin);
app.post('/admin/login', users.adminValidasi);
app.get('/admin/dashboard', pengamananAdmin, users.adminDashboard);

// rubah
app.get('/admin/dashboard/semua-user', pengamananAdmin, users.semuaUser);
app.get('/admin/dashboard/lunas', pengamananAdmin, users.userLunas);
app.get('/admin/dashboard/belum-lunas', pengamananAdmin, users.userBelumLunas);
app.get('/admin/dashboard/waiting-list', pengamananAdmin, users.waitingList);


//kotak validasi admin 
app.get('/admin/dashboard/kotak-validasi', pengamananAdmin, users.kotakValidasi );

app.get('/admin/dashboard/kotak-validasi/:id', pengamananAdmin, users.detailValidasi );

app.get('/admin/dashboard/user-detail/:id', pengamananAdmin, users.userDetail);
app.post('/admin/dashboard/user-detail/:id', pengamananAdmin, users.userDetailPost);
app.get('/admin/dashboard/send-email/:id', pengamananAdmin, users.sendEmail);
app.post('/admin/dashboard/send-email/:id', pengamananAdmin, users.sendEmailAct);

app.post('/admin/dashboard/delete-user/:id', pengamananAdmin, users.deletePeserta);
// app.post('/admin/dashboard/user-detail/kirimsms',pengamananAdmin, users.kirimSms)

// app.post('/admin/posting',pengamananAdmin, routes.posting );


/*
    Untuk kepeluan user 
*/

app.get('/login', users.login);
app.post('/login', users.membuktikan);
app.get('/profile', pengamananUser, users.profile);
// app.get('/admin/dashboard',pengamananAdmin ,users.dashboard);
app.get('/daftar', users.daftar);
app.get('/keluar', users.keluar);
// app.get('/admin/masukanpost', users.addPost);


app.post('/mendaftar', users.mendaftar);
// app.post('/admin/dashboard/update/:id',pengamananAdmin , users.update);
// app.get('/admin/dashboard/detele/:id', pengamananAdmin, users.deleteUser);

//data diri user
app.get('/user/data', pengamananUser, users.validasi);
app.post('/user/data', pengamananUser, users.validasiPost);

app.get('/user/ketentuan', pengamananUser, users.ketentuan);

// validasi tiket
app.get('/user/validasi', pengamananUser, users.tiket);
app.post('/user/validasi', pengamananUser, users.tiketPost);




//dev 
app.post('/dev', users.cobaGet);
// app.post ('/dev', users.cobaPost);





// var api_key = 'key-fd687b0a68bc8505dfa4eb84605b9033';
// var domain = 'sandbox0e4ae9030dd64b0caaaa32721d188a83.mailgun.org';
// var mailgun = require('mailgun-js')({apiKey: api_key, domain: domain});
 
// var data = {
//   from: 'Node JS Bootcamp Team <postmaster@sandbox0e4ae9030dd64b0caaaa32721d188a83.mailgun.org>',
//   to: 'faisalarkan21@gmail.com',
//   subject: 'Hello',
//   text: 'Testing some Mailgun awesomness!'
// };
 
// mailgun.messages().send(data, function (error, body) {
//   console.log(body);
// });

app.get('/favicon.ico', function(req, res) {
    res.status(204);
});

app.get('/robots.txt', function(req, res) {
    res.status(204);
});

// catch 404 and forward to error handler
app.use(function (req, res, next) {
    var err = new Error('Not Found');
    err.status = 404;
    next(err);
});

// error handlers
app.set('port', (process.env.PORT || 3002));

app.listen(app.get('port'),  () => {
  console.log(`Server berjalan di port : http://localhost:${app.get('port')}/`)
}) 

// development error handler
// will print stacktrace
if (app.get('env') === 'development') {
    app.use(function (err, req, res, next) {
        res.status(err.status || 500);
        res.render('error', {
            message: err.message,
            error: err
        });
    });
}

// production error handler
// no stacktraces leaked to user
app.use(function (err, req, res, next) {
    res.status(err.status || 500);
    res.render('error', {
        message: err.message,
        error: {}
    });
});


module.exports = app;