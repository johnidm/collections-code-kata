var MongoClient = require('mongodb').MongoClient;
var ObjectID = require('mongodb').ObjectID;

var _id_procurado = new ObjectID('54d9e1f15d6972f96da75832');

MongoClient.connect('mongodb://127.0.0.1:27017/contatooh',
	function(erro, db) {
		if (erro) throw err;

		db.collection('contatos').findOne({_id: _id_procurado}, 
			function(erro, contato) {
				if (erro) throw err;

				console.log(contato);
			}
		);
	}
);

