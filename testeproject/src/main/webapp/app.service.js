angular.module('paginaColab')
        .factory('Person', ['$resource',
            function ($resource) {
                return $resource(
                        "rest/person/get",
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
