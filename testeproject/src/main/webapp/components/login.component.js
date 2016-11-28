'use script';

angular
    .module('login')
    .component('login', {
        templateUrl: 'templates/login.template.html',
        controller: ['LoginCtrl', 
            function LoginController(LoginCtrl){
                console.log('$scope');
        }]
});

