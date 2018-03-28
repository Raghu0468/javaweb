var myApp = angular.module("myApp", ['ngRoute']);

myApp.config(function($routeProvider) {
	$routeProvider

	.when('/dashboard', {
			templateUrl: 'dashboard.html'
		})

	.when('/elements', {
			templateUrl: 'elements.html'
		})
	.when('/buttons', {
			templateUrl: 'views/buttons.html'
			
		})
		.when('/content-slider', {
			templateUrl: 'content-slider.html'
		})
		.when('/jquery-ui', {
			templateUrl: 'views/jquery-ui.html'
        })
		.when('/jqgrid', {
			templateUrl: 'views/jqgrid.html'
        
		})
		.when('/form-elements', {
			templateUrl: 'form-elements.html'
		})
		
		.when('/form-elements-2', {
			templateUrl: 'form-elements-2.html'
		})
		.when('/form-wizard', {
			templateUrl: 'form-wizard.html'
		})
		
		.when('/dropzone', {
			templateUrl: 'dropzone.html'
		})
		.when('/widgets', {
			templateUrl: 'widgets.html'
		})
		.when('/calendar', {
			templateUrl: 'calendar.html'
		})
		.when('/inbox', {
			templateUrl: 'inbox.html'
		})
		.when('/invoice', {
			templateUrl: 'views/invoice.html'
		})
		.when('/faq', {
			templateUrl: 'faq.html'
		})
		.when('/tables', {
			templateUrl: 'views/tables.html'
		})
		.when('/mobile-menu-2', {
			templateUrl: 'views/mobile-menu-2.html'
		})
		.when('/mobile-menu-1', {
			templateUrl: 'views/mobile-menu-1.html'
		})
		.when('/mobile-menu-3', {
			templateUrl: 'views/mobile-menu-3.html'
		})
		.when('/pricing', {
			templateUrl: 'views/pricing.html'
		})
		
		.when('/gallery', {
			templateUrl: 'gallery.html'
        })
		
		.when('/nestable-list', {
			templateUrl: 'nestable-list.html'
		})
		.when('/timeline', {
			templateUrl: 'timeline.html'
		})
		.when('/profile', {
			templateUrl: 'profile.html'
		})
		.when('/search', {
			templateUrl: 'search.html'
		})
		.when('/error-404', {
			templateUrl: 'views/error-404.html'
		})
		.when('/error-500', {
			templateUrl: 'views/error-500.html'
		})
		.when('/email', {
			templateUrl: 'views/email.html'
		})
		.when('/typography', {
			templateUrl: 'views/typography.html'
		})
		.when('/wysiwyg', {
			templateUrl: 'wysiwyg.html'
		})
		.when('/treeview', {
			templateUrl: 'treeview.html'
		})

		.when('/grid', {
			templateUrl: 'views/grid.html'
		})
		.when('/menu', {
			templateUrl: 'views/menu.html'
		})
		//.when('/header', {
		//	templateUrl: 'views/header.html'
		//})
		//.when('/footer', {
		//	templateUrl: 'views/footer.html'
		//})
		//.when('/notify', {
		//	templateUrl: 'views/notify.html'
		//})
		//.when('/require', {
		//	templateUrl: 'views/require.html'
		//})
		.when('/top-menu', {
			templateUrl: 'views/top-menu.html'
		})
		.when('/two-menu-1', {
			templateUrl: 'views/two-menu-1.html'
		})
		.when('/two-menu-2', {
			templateUrl: 'views/two-menu-2.html'
		});
});


