package issue10622

class UrlMappings {

    static mappings = {
        //        "/test/deprecated" (redirect: [uri: "/test/newHotness"]) //, permanent: true])
        "/test/deprecated" (redirect: "/test/newHotness") //, permanent: true])

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
