//Register 'phoneList' component, along with its assiciated controller and template
angular.
  module('formDadosPessoais', []).
  component('formDadosPessoais', {
    templateUrl: 'templates/form-dados-pessoais.template.html',
    controller: [ 'Colaborador',
            function dadosColabController(Colaborador){
                var self = this;
                
                self.dados = Colaborador.get();

                colab = {"nrColaborador":6,
                        "nome":"asdasdadass",
                        "dataNasc":"nov 25, 2016",
                        "nacionalidade":"asdasd",
                        "numDoc":"asdasd",
                        "dataEmissaoDoc":"nov 25, 2016",
                        "dataFimDoc":"nov 25, 2016",
                        "estadoCivil":"c","nif":123454,
                        "nrSegSocial":"sdfsdf",
                        "habLiteraria":"asdasd",
                        "cartaCond":"s",
                        "repartFinancas":"dsfsf"};
                
                self.posta = Colaborador.post(colab);
            }
        ]
});

