package co.com.ies.web.rest.router;

import co.com.ies.service.dto.router.operatormodule.GetAllRafflesModuleRequest;
import co.com.ies.service.dto.router.operatormodule.GetAllRafflesModuleResponse;
import co.com.ies.service.dto.router.operatormodule.GetRafflesModuleRequest;
import co.com.ies.service.dto.router.operatormodule.GetRafflesModuleResponse;
import co.com.ies.service.dto.router.operatormodule.GetRoomsModuleRequest;
import co.com.ies.service.dto.router.operatormodule.GetRoomsModuleResponse;
import co.com.ies.service.dto.sub.FigureAndAward;
import co.com.ies.service.dto.sub.Raffle;
import co.com.ies.service.dto.sub.Room;
import co.com.ies.service.dto.sub.RoomAndRaffle;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simulatoroperatormodule")
public class SimulatorOperatorModule {

  @PostMapping("/getrooms")
  @ResponseBody
  public GetRoomsModuleResponse getBingoRooms(@Valid @RequestBody GetRoomsModuleRequest request) {
    List<Room> lista = new ArrayList<>();
    lista.add(new Room().setName("verdolaga").setDescription("Sala de bingos para eventos del atletico nacional").setForPlaying(26));
    lista.add(new Room().setName("grandes premios").setDescription("Sala de bingos con los más grandes premios").setForPlaying(5));

    return new GetRoomsModuleResponse().setRooms(lista);
  }

  @PostMapping("/getraffles")
  @ResponseBody
  public GetRafflesModuleResponse getBingoRaffles(
      @Valid @RequestBody GetRafflesModuleRequest request) {
    List<FigureAndAward> figureAndAwardList = new ArrayList<>();
    List<FigureAndAward> figureAndAwardList2 = new ArrayList<>();
    List<Raffle> raffleList = new ArrayList<>();

    figureAndAwardList.add(new FigureAndAward().setFigure("7").setAward("20000"));
    figureAndAwardList.add(new FigureAndAward().setFigure("3").setAward("40000"));

    figureAndAwardList2.add(new FigureAndAward().setFigure("1").setAward("30.3"));
    figureAndAwardList2.add(new FigureAndAward().setFigure("11").setAward("48.5"));

    raffleList.add(new Raffle().setId(1).setState("PENDIENTE").setRaffleType("GARANTIZADO")
        .setTablePrize(new BigDecimal(1000.0)).setLaunchingDate(Date.from(Instant.now()))
        .setAwards(figureAndAwardList));
    raffleList.add(new Raffle().setId(2).setState("FINALIZADO").setRaffleType("PORCENTUAL")
        .setTablePrize(new BigDecimal(4000.0)).setLaunchingDate(Date.from(Instant.EPOCH))
        .setAwards(figureAndAwardList2));

    return new GetRafflesModuleResponse().setRaffles(raffleList);
  }

  @PostMapping("/getallraffles")
  @ResponseBody
  public GetAllRafflesModuleResponse getAllBingoRaffles(
      @Valid @RequestBody GetAllRafflesModuleRequest request) {
    List<FigureAndAward> figureAndAwardList = new ArrayList<>(); 
    List<FigureAndAward> figureAndAwardList2 = new ArrayList<>(); 
    List<FigureAndAward> figureAndAwardList3 = new ArrayList<>(); 
    List<FigureAndAward> figureAndAwardList4 = new ArrayList<>();
    List<Raffle> raffleList = new ArrayList<>();
    List<Raffle> raffleList2 = new ArrayList<>(); 
    List<RoomAndRaffle> roomAndRaffleList = new ArrayList<>();

    figureAndAwardList.add(new FigureAndAward().setFigure("7").setAward("20000"));
    figureAndAwardList.add(new FigureAndAward().setFigure("3").setAward("40000"));

    figureAndAwardList2.add(new FigureAndAward().setFigure("1").setAward("30.3"));
    figureAndAwardList2.add(new FigureAndAward().setFigure("11").setAward("48.5"));
    
    figureAndAwardList3.add(new FigureAndAward().setFigure("4").setAward("20.2"));
    figureAndAwardList3.add(new FigureAndAward().setFigure("6").setAward("65.1"));
    
    figureAndAwardList4.add(new FigureAndAward().setFigure("8").setAward("200000"));
    figureAndAwardList4.add(new FigureAndAward().setFigure("13").setAward("400000"));

    raffleList.add(new Raffle().setId(1).setState("PENDIENTE").setRaffleType("GARANTIZADO")
        .setTablePrize(new BigDecimal(1000.0)).setLaunchingDate(Date.from(Instant.now()))
        .setAwards(figureAndAwardList));
    raffleList.add(new Raffle().setId(2).setState("FINALIZADO").setRaffleType("PORCENTUAL")
        .setTablePrize(new BigDecimal(4000.0)).setLaunchingDate(Date.from(Instant.EPOCH))
        .setAwards(figureAndAwardList2));
    
    raffleList2.add(new Raffle().setId(5).setState("INICIADO").setRaffleType("PORCENTUAL")
        .setTablePrize(new BigDecimal(3000.0)).setLaunchingDate(Date.from(Instant.EPOCH))
        .setAwards(figureAndAwardList3));
    raffleList2.add(new Raffle().setId(7).setState("CANCELADO").setRaffleType("GARANTIZADO")
        .setTablePrize(new BigDecimal(5000.0)).setLaunchingDate(Date.from(Instant.now()))
        .setAwards(figureAndAwardList4));

    roomAndRaffleList.add(new RoomAndRaffle().setName("verdolaga").setDescription("Sala de bingos para eventos del atletico nacional")
        .setForPlaying(26).setRaffles(raffleList));

    roomAndRaffleList.add(new RoomAndRaffle().setName("grandes premios").setDescription("Sala de bingos con los más grandes premios")
        .setForPlaying(5).setRaffles(raffleList2));

    return new GetAllRafflesModuleResponse().setAllRaffles(roomAndRaffleList);
  }
}
