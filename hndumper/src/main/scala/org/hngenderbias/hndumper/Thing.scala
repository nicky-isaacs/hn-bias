package hndumper.src.main.scala.org.hngenderbias.hndumper

import cats.effect.{ContextShift, IO, Timer}
import org.http4s.client.Client
import org.http4s.client.blaze._
import scala.concurrent.ExecutionContext.Implicits.global

object Thing {

  implicit val cs: ContextShift[IO] = IO.contextShift(global)
  implicit val timer: Timer[IO] = IO.timer(global)

  private val client: IO[Unit] = BlazeClientBuilder[IO](global).resource.use { c: Client[IO] =>
    
    IO.unit
  }

  def main(args: Array[String]): Unit = {}

}
