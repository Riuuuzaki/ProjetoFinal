angular.module('ausencias', []).component('ausencias', {
    templateUrl: 'templates/ausencias.template.html',
    controller: ['Colaborador',
        function AusenciasController(Colaborador) {
            var self = this;
                
            self.dados = Colaborador.query();
                        
        }
    ]
});