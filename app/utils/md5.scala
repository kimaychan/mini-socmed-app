package utils

import java.security.MessageDigest

object md5:
  def md5Hash(string: String): String = {
    val md = MessageDigest.getInstance("MD5")
    val hashedBytes = md.digest(string.getBytes("UTF-8"))
    val hashedString = hashedBytes.map("%02x".format(_)).mkString
    hashedString
  }