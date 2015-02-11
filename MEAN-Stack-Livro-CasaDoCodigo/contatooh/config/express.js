var express = require('express');

var load = require('express-load');

var body_parser = require('body-parser');

var cookie_parser = require('cookie-parser');
var session = require('express-session');
var passport = require('passport');

var helmet = require('helmet');


module.exports = function() {
	var app = express();
	
	app.set('port', 3000);

	app.use(express.static('./public'));

	app.set('view engine', 'ejs');
	app.set('views', './app/views');

	app.use(body_parser.urlencoded({extended: true}));
	app.use(body_parser.json());
	app.use(require('method-override')());

	app.use(cookie_parser());
	app.use(session(
		{
			secret: 'homem avestruz',
			resave: true,
			saveUninitialized: true
		}
	));

	app.use(passport.initialize());
	app.use(passport.session());
	//app.use(helmet());

	app.use(helmet.xframe());
	app.use(helmet.xssFilter());
	app.use(helmet.nosniff());

	app.disable('x-powered-by');

	load('models', {cwd: 'app'})
		.then('controllers')
		.then('routes')
		.into(app);

	app.get('*', function(req, res) {
		res.status(404).render('404');
	});

	return app;	
}
