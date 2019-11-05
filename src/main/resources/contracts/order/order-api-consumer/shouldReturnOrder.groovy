package contracts.order

[
        org.springframework.cloud.contract.spec.Contract.make {
            name("get order")
            request {
                method GET()
                urlPath '/order/1'
            }

            response {
                status OK()
                headers {
                    contentType(applicationJson())
                }
                body("{\"id\":1,\"name\":\"Some Order\"}")
            }
        }
]

