package shareevent.model

import org.joda.time.Interval

sealed trait BookingStatus

case object BookingStatus {

  case object Preliminary extends BookingStatus

  case object Final extends BookingStatus

}

case class Booking(time: Interval,
                   event: Event,
                   status: BookingStatus = BookingStatus.Preliminary)



case class Location(
  name:  String,
  books: Seq[Booking] = Seq())
