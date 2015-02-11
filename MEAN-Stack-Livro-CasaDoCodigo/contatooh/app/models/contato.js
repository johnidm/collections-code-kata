var mongoose = require('mongoose');

module.exports = function() {
	var schema = mongoose.Schema({
		nome: {
			type: String,
			require: true
		},
		email: {
			type: String,
			require: true,
			index: {
				unique: true
			}
		},
		emergencia: {
			type: mongoose.Schema.ObjectId,
			ref: 'Contato'
		}
	});

	return mongoose.model('Contato', schema);
}
