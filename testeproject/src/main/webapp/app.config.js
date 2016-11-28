'use strict';
angular.
  module('paginaColab').
  config(['$locationProvider' ,'$routeProvider',
    function config($locationProvider, $routeProvider) {
      $locationProvider.hashPrefix('!');

      $routeProvider.
        when('/dadosPessoais', {
          template: '<form-dados-pessoais></form-dados-pessoais>'
        }).
        when('/ausencias', {
          template: '<ausencias></ausencias>'
        }).
        when('/login', {
          template: '<login></login>'
        }).
        otherwise('/login');
    }
  ]);


