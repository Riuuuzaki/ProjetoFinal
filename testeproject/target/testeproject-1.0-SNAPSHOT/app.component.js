angular.module('paginaColab')
    .component('dadosColab', {
        templateUrl:'app.template.html',
        controller: [ 'Person',
            function dadosColabController(Person){
                var self = this;
                
                self.dados = Person.query();
            }
        ]}
    );

