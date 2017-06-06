
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/florianeMac/Documents/GitHub/AWIAPPP/conf/routes
// @DATE:Wed Jun 07 01:29:40 CEST 2017


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
