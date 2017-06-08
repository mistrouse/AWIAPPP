
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mehdi/bachir/AWIAPPP/conf/routes
// @DATE:Thu Jun 08 16:40:17 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
