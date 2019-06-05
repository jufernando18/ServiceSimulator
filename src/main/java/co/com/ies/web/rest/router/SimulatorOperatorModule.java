package co.com.ies.web.rest.router;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.service.dto.router.operator.GetRoomsRequest;
import co.com.ies.service.dto.router.operator.GetRoomsResponse;
import co.com.ies.service.dto.sub.Room;

@RestController
@RequestMapping("/simulatoroperatormodule")
public class SimulatorOperatorModule {

  @PostMapping("/getrooms")
  @ResponseBody
  public GetRoomsResponse getBingoRooms(@Valid @RequestBody GetRoomsRequest request) {
    List<Room> lista = new ArrayList<>();
    lista.add(
        new Room()
        .setName("nombre")
        .setDescription("descripcion")
        .setForPlaying(26));
    lista.add(
        new Room()
        .setName("nombre2")
        .setDescription("descripcion2")
        .setForPlaying(5));
    
    return new GetRoomsResponse().setRooms(lista);
  }
}
