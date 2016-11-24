angular.module('paginaColab')
    .component('dadosColab', {
        templateUrl:'app.template.html',
        controller: [ 'Colaborador',
            function dadosColabController(Colaborador){
                var self = this;
                
                self.dados = Colaborador.query();
                
            }
        ]}
    );

