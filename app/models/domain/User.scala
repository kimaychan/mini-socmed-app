package models.domain

import java.util.UUID
import utils.md5._

case class User(id: UUID, username: String, password: String)

object User {
  def apply(username: String, password: String): User = User(UUID.randomUUID(), username, md5Hash(password))
}