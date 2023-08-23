package lean.kotlinsb.KotlinBank

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping

@RestController
@RequestMapping("/api/v1/hello")
class HelloController {
  @GetMapping("")
  fun index() : String {
    return "Hello World!"
  }
}
