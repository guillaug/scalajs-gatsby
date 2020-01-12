package components

import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._

/*@ScalaJSDefined // required for Scala.js 0.6.x, unless using -P:scalajs:sjsDefinedByDefault
@JSExportTopLevel("slinky")
object MyComponent extends js.Object {

  def hello(name: String): String = s"Hello $name !! (from slinky)"
}*/


@react class MyComponent extends StatelessComponent {
  case class Props(name: String)

  def render = {
    h1(s"Hello ${props.name} (from Slinky via ScalaJS !)")
  }

}