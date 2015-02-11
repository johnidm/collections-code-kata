var passport = require('passport');

var mongoose = require('mongoose');

var GitHubStrategy = require('passport-github').Strategy;

module.exports = function() {

	var Usuario = mongoose.model('Usuario');

	passport.use(new GitHubStrategy({
		clientID: '33f15116a5748960e537',
		clientSecret: '2fb636486044e6adae98ee9c5a859566415d1123',
		callbackURL: 'http://localhost:3000/auth/github/callback'
	}, function(accessToken, refreshToken, profile, done) {

		//console.log(profile);

		Usuario.findOrCreate(		

			{"login": profile.username},
			{"nome": profile.username},

			function(erro, usuario) {
				if (erro) {
					console.error(erro);
					return done(erro);
				}

				return done(null, usuario);
			}

		);
	}));

	passport.serializeUser(function(usuario, done) {
		done(null, usuario._id);
	});

	passport.deserializeUser(function(id, done) {

		Usuario.findById(id).exec()
			.then(function(usuario) {
				done(null, usuario);
			});
	});
	
}
