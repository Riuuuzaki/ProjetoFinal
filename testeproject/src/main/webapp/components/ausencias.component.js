angular.module('ausencias', []).component('ausencias', {
    templateUrl: 'templates/ausencias.template.html',
    controller: ['Ausencia',
        function AusenciaController(Ausencia) {
            var self = this;

            self.dados = Ausencia.get();

            aus = {"idAusencia": 1,
                "nrColaborador": {nrColaborador: 5},
                "tpAusencia": "1",
                //"dtInicio": "111",
               // "dtFim": "111",
                "isFeria": "s",
                "obs": "uheuh",
                //"nmAnexo": "c",
                //"anexo": "aa"
            };

            self.posta = Ausencia.post(aus);

        }
    ]
});