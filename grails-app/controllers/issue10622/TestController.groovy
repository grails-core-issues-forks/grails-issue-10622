package issue10622

class TestController {

    def newHotness() {
        render(view: "/test/index", model: [message: "New hotness!", params: params])
    }

    def deprecated2() {
        render(view: "/test/index", model: [message: "Deprecated old stuff", params: params])
    }
}
