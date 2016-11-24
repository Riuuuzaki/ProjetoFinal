//Register 'phoneList' component, along with its assiciated controller and template
angular.
  module('formDadosPessoais', []).
  component('formDadosPessoais', {
    templateUrl: 'form-dados-pessoais/form-dados-pessoais.template.html',
    controller: [ 'Colaborador',
            function dadosColabController(Colaborador){
                var self = this;
                
                self.dados = Colaborador.query();
            }
        ]
});

