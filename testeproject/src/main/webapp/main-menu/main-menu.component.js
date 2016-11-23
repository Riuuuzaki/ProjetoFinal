//Register 'phoneList' component, along with its assiciated controller and template
angular.
  module('mainMenu', []).
  component('mainMenu', {
    templateUrl: 'main-menu/main-menu.template.html',
  controller: ['Menu',
          function MenuListController(Menu) {
            }
  ]
});


