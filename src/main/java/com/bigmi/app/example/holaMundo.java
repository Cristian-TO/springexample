
@RestController
public class holaMundo {

@GetMapping("/hola")
public String hello() {
return "hola";
}
}