angular.module('paginaColab')
        .factory('Colaborador', ['$resource',
            function ($resource) {
                return $resource(
                        "rest/colaborador/getColaborador",
                        {},
                        {
                            query: {
                                method: 'GET',
                                isArray: false
                            }
                        }
                );
            }
        ]);
