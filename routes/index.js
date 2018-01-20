

// /*
//     Instalasi mongo untuk artikel
// */


// var mongo = require ('./config/mongo-config')
// var autoincrementPosting = require('mongoose-auto-increment');

// autoincrementPosting.initialize(mongo);

// var skema = new mongo.Schema({

//     judul:String,
//     artikel: String,
//     date: {type:Date, default:Date.now},
//     gambar : Buffer,
//     setuju: Boolean


// });


// skema.plugin(autoincrementPosting.plugin,{

//     model:'artikel',
//     field: 'artkelId',
//     startAt:1

// });

// var postArtikel = mongo.model('artikel', skema);



// exports.index = function (req, res,next) {


//     postArtikel.find({}, function (err,artikel){

//         res.render('index',{data:artikel});


//     });
 

// };

// exports.posting = function (req,res){

// 	  var insertArtikel = new postArtikel({

//         judul: req.body.judul,
//         artikel: req.body.posting,      
//         setuju: true

//     });

//     insertArtikel.save (function(err){
//       if (err)
//         return console.log('errrorr mass!'+ err);

//         console.log("berhasil!");
      

//     });



 

//   res.redirect('/');



// }


