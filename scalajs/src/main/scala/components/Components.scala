package components

import slinky.core._

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSExportTopLevel("Components")
object components {

  @JSExport("MyComponent")
  val myComponent: ReactComponentClass[_] = MyComponent

}
