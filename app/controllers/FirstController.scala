package controllers

import play.api.mvc.{Action, Controller}

class FirstController extends Controller {

  def greet(name:String) = Action(Ok("hello " + name))
}
