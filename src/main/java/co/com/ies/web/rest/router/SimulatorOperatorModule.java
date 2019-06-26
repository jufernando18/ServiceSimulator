package co.com.ies.web.rest.router;

import co.com.ies.service.dto.router.operatormodule.GetAllRafflesModuleRequest;
import co.com.ies.service.dto.router.operatormodule.GetAllRafflesModuleResponse;
import co.com.ies.service.dto.router.operatormodule.GetRafflesModuleRequest;
import co.com.ies.service.dto.router.operatormodule.GetRafflesModuleResponse;
import co.com.ies.service.dto.router.operatormodule.GetRoomsModuleRequest;
import co.com.ies.service.dto.router.operatormodule.GetRoomsModuleResponse;
import co.com.ies.service.dto.router.operatormodule.LaunchGameModuleRequest;
import co.com.ies.service.dto.router.operatormodule.LaunchGameModuleResponse;
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

  private static final String GAME_CODE = "wplay/1/5";
  private static final String GAME_CODE2 = "wplay/2/6";
  private static final String GAME_CODE3 = "wplay/3/7";
  private static final String GAME_CODE4 = "wplay/4/10";
  private static final String FIGURE = "1";
  private static final String FIGURE2 = "2";
  private static final String FIGURE3 = "3";
  private static final String FIGURE4 = "4";
  private static final String FIGURE5 = "5";
  private static final String FIGURE6 = "6";
  private static final String FIGURE7 = "7";
  private static final String FIGURE8 = "8";
  private static final String GUARANTEED = "40000";
  private static final String GUARANTEED2 = "20000";
  private static final String GUARANTEED3 = "20000";
  private static final String GUARANTEED4 = "30000";
  private static final String GUARANTEED5 = "40000";
  private static final String GUARANTEED6 = "10000";
  private static final String GUARANTEED7 = "700000";
  private static final String GUARANTEED8 = "300000";  
  private static final String PERCENTAGE = "40.0";
  private static final String PERCENTAGE2 = "20";
  private static final String PERCENTAGE3 = "50.6";
  private static final String PERCENTAGE4 = "30.0";
  private static final String PERCENTAGE5 = "58.7";
  private static final String PERCENTAGE6 = "33.2";
  private static final String PERCENTAGE7 = "20.0";
  private static final String PERCENTAGE8 = "60.0";  
  private static final String ROOM_NAME = "verdolaga";
  private static final String ROOM_NAME2 = "grandes premios";
  private static final String ROOM_DESCRIPTION = "Sala de bingos para eventos del atletico nacional";
  private static final String ROOM_DESCRIPTION2 = "Sala de bingos con los más grandes premios";
  private static final String RAFFLE_NAME = "sorteo preventa verdolaga";
  private static final String RAFFLE_NAME2 = "sorteo familia verdolaga";
  private static final String RAFFLE_NAME3 = "gran sorteo acumulado semanal";
  private static final String RAFFLE_NAME4 = "gran sorteo acumulado mensual";
  private static final Date RAFFLE_DATE = Date.from(Instant.EPOCH);
  private static final Date RAFFLE_DATE2 = Date.from(Instant.now());
  private static final String PENDIENTE = "PENDIENTE";
  private static final String INICIADO = "INICIADO";
  private static final String FINALIZADO = "FINALIZADO";
  private static final String CANCELADO = "CANCELADO";
  private static final String STATE_DESCRIPTION = "Descripción del estado actual del sorteo preventa verdolaga";
  private static final String STATE_DESCRIPTION2 = "Descripción del estado actual del sorteo familia verdolaga";
  private static final String STATE_DESCRIPTION3 = null;
  private static final String STATE_DESCRIPTION4 = "Descripción del estado actual del gran sorteo acumulado mensual";
  private static final String PORCENTUAL = "PORCENTUAL";
  private static final String GARANTIZADO = "GARANTIZADO";
  private static final BigDecimal TABLE_PRICE = new BigDecimal(1000);
  private static final BigDecimal TABLE_PRICE2 = new BigDecimal(4000);
  private static final BigDecimal TABLE_PRICE3 = new BigDecimal(3000);
  private static final BigDecimal TABLE_PRICE4 = new BigDecimal(5000);
  private static final BigDecimal MINIMUM_SALE = new BigDecimal(200000);
  private static final BigDecimal MINIMUM_SALE2 = new BigDecimal(400000);
  private static final BigDecimal MINIMUM_SALE3 = new BigDecimal(1530000);
  private static final BigDecimal MINIMUM_SALE4 = new BigDecimal(3450000);

  @PostMapping("/launchgame")
  @ResponseBody
  public LaunchGameModuleResponse getGame(@Valid @RequestBody LaunchGameModuleRequest request) {
    return new LaunchGameModuleResponse().setUrl("endpointUrl").setToken("gameToken");
  }
  
  @PostMapping("/getrooms")
  @ResponseBody
  public GetRoomsModuleResponse getBingoRooms(@Valid @RequestBody GetRoomsModuleRequest request) {
    List<co.com.ies.service.dto.sub.summarydata.RoomAndRaffle> roomAndRaffleList = new ArrayList<>();
    List<co.com.ies.service.dto.sub.summarydata.Raffle> raffleList = new ArrayList<>();
    List<co.com.ies.service.dto.sub.summarydata.Raffle> raffleList2 = new ArrayList<>();

    raffleList.add(new co.com.ies.service.dto.sub.summarydata.Raffle().setGameCode(GAME_CODE).setName(RAFFLE_NAME).setState(PENDIENTE).setStateDescription(STATE_DESCRIPTION).setLaunchingDate(RAFFLE_DATE));
    raffleList.add(new co.com.ies.service.dto.sub.summarydata.Raffle().setGameCode(GAME_CODE2).setName(RAFFLE_NAME2).setState(PENDIENTE).setStateDescription(STATE_DESCRIPTION2).setLaunchingDate(RAFFLE_DATE2));
    raffleList2.add(new co.com.ies.service.dto.sub.summarydata.Raffle().setGameCode(GAME_CODE3).setName(RAFFLE_NAME3).setState(PENDIENTE).setLaunchingDate(RAFFLE_DATE2));
    raffleList2.add(new co.com.ies.service.dto.sub.summarydata.Raffle().setGameCode(GAME_CODE4).setName(RAFFLE_NAME4).setState(PENDIENTE).setStateDescription(STATE_DESCRIPTION4).setLaunchingDate(RAFFLE_DATE));
    roomAndRaffleList.add(new co.com.ies.service.dto.sub.summarydata.RoomAndRaffle().setRoom(new Room().setName(ROOM_NAME)
        .setDescription(ROOM_DESCRIPTION)).setRaffles(raffleList));
    roomAndRaffleList.add(new co.com.ies.service.dto.sub.summarydata.RoomAndRaffle().setRoom(new Room().setName(ROOM_NAME2)
        .setDescription(ROOM_DESCRIPTION2)).setRaffles(raffleList2));

    return new GetRoomsModuleResponse().setRooms(roomAndRaffleList);
  }

  @PostMapping("/getraffles")
  @ResponseBody
  public GetRafflesModuleResponse getBingoRaffles(
      @Valid @RequestBody GetRafflesModuleRequest request) {
    List<FigureAndAward> figureAndAwardList = new ArrayList<>();
    List<FigureAndAward> figureAndAwardList2 = new ArrayList<>();
    List<Raffle> raffleList = new ArrayList<>();

    figureAndAwardList.add(new FigureAndAward().setFigure(FIGURE).setPercentage(PERCENTAGE).setGuaranteed(GUARANTEED));
    figureAndAwardList.add(new FigureAndAward().setFigure(FIGURE2).setPercentage(PERCENTAGE2).setGuaranteed(GUARANTEED2));

    figureAndAwardList2.add(new FigureAndAward().setFigure(FIGURE3).setPercentage(PERCENTAGE3).setGuaranteed(GUARANTEED3));
    figureAndAwardList2.add(new FigureAndAward().setFigure(FIGURE4).setPercentage(PERCENTAGE4).setGuaranteed(GUARANTEED4));

    raffleList.add(new Raffle().setGameCode(GAME_CODE).setName(RAFFLE_NAME).setState(PENDIENTE).setStateDescription(STATE_DESCRIPTION)
        .setTablePrice(TABLE_PRICE).setMinimunSale(MINIMUM_SALE).setLaunchingDate(RAFFLE_DATE2)
        .setAwards(figureAndAwardList));
    raffleList.add(new Raffle().setGameCode(GAME_CODE2).setName(RAFFLE_NAME2).setState(FINALIZADO).setStateDescription(STATE_DESCRIPTION2)
        .setTablePrice(TABLE_PRICE2).setMinimunSale(MINIMUM_SALE2).setLaunchingDate(RAFFLE_DATE)
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

    figureAndAwardList.add(new FigureAndAward().setFigure(FIGURE).setPercentage(PERCENTAGE).setGuaranteed(GUARANTEED));
    figureAndAwardList.add(new FigureAndAward().setFigure(FIGURE2).setPercentage(PERCENTAGE2).setGuaranteed(GUARANTEED2));

    figureAndAwardList2.add(new FigureAndAward().setFigure(FIGURE3).setPercentage(PERCENTAGE3).setGuaranteed(GUARANTEED3));
    figureAndAwardList2.add(new FigureAndAward().setFigure(FIGURE4).setPercentage(PERCENTAGE4).setGuaranteed(GUARANTEED4));

    figureAndAwardList3.add(new FigureAndAward().setFigure(FIGURE5).setPercentage(PERCENTAGE5).setGuaranteed(GUARANTEED5));
    figureAndAwardList3.add(new FigureAndAward().setFigure(FIGURE6).setPercentage(PERCENTAGE6).setGuaranteed(GUARANTEED6));

    figureAndAwardList4.add(new FigureAndAward().setFigure(FIGURE7).setPercentage(PERCENTAGE7).setGuaranteed(GUARANTEED7));
    figureAndAwardList4.add(new FigureAndAward().setFigure(FIGURE8).setPercentage(PERCENTAGE8).setGuaranteed(GUARANTEED8));

    raffleList.add(new Raffle().setGameCode(GAME_CODE).setName(RAFFLE_NAME).setState(PENDIENTE).setStateDescription(STATE_DESCRIPTION)
        .setTablePrice(TABLE_PRICE).setMinimunSale(MINIMUM_SALE).setLaunchingDate(RAFFLE_DATE2)
        .setAwards(figureAndAwardList));
    raffleList.add(new Raffle().setGameCode(GAME_CODE2).setName(RAFFLE_NAME2).setState(FINALIZADO).setStateDescription(STATE_DESCRIPTION2)
        .setTablePrice(TABLE_PRICE2).setMinimunSale(MINIMUM_SALE2).setLaunchingDate(RAFFLE_DATE)
        .setAwards(figureAndAwardList2));

    raffleList2.add(new Raffle().setGameCode(GAME_CODE3).setName(RAFFLE_NAME3).setState(INICIADO).setStateDescription(STATE_DESCRIPTION3)
        .setTablePrice(TABLE_PRICE3).setMinimunSale(MINIMUM_SALE3).setLaunchingDate(RAFFLE_DATE)
        .setAwards(figureAndAwardList3));
    raffleList2.add(new Raffle().setGameCode(GAME_CODE4).setName(RAFFLE_NAME4).setState(CANCELADO).setStateDescription(STATE_DESCRIPTION4)
        .setTablePrice(TABLE_PRICE4).setMinimunSale(MINIMUM_SALE4).setLaunchingDate(RAFFLE_DATE2)
        .setAwards(figureAndAwardList4));

    roomAndRaffleList.add(new RoomAndRaffle().setRoom(new Room().setName(ROOM_NAME).setDescription(ROOM_DESCRIPTION))
        .setRaffles(raffleList));

    roomAndRaffleList.add(new RoomAndRaffle().setRoom(new Room().setName(ROOM_NAME2).setDescription(ROOM_DESCRIPTION2))
        .setRaffles(raffleList2));

    return new GetAllRafflesModuleResponse().setAllRaffles(roomAndRaffleList);
  }
}
