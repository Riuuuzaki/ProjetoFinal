angular.module('paginaColab')
        .factory('Colaborador', ['$resource',
            function ($resource) {
                return $resource(
                        {},
                        {},
                        {
                            get: {
                                method: 'GET',
                                isArray: false,
                                url: 'rest/colaborador/getColaborador'
                            },
                            
                            post: {
                                method: 'POST',
                                isArray: false,
                                url: 'rest/colaborador/saveColaborador',
                                headers: [{'Content-Type': 'application/json'}]   
                            }
                        }
                );
            }
        ]);
