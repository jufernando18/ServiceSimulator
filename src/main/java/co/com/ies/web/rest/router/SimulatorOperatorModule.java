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
import co.com.ies.service.dto.sub.RaffleResume;
import co.com.ies.service.dto.sub.RoomAndRaffle;
import co.com.ies.service.dto.sub.RoomAndRaffleResume;

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

  private static final Long ROOM_ID = 1L;
  private static final Long ROOM_ID2 = 2L;
  private static final Long RAFFLE_ID = 1L;
  private static final Long RAFFLE_ID2 = 2L;
  private static final Long RAFFLE_ID3 = 3L;
  private static final Long RAFFLE_ID4 = 4L;
  private static final String FIGURE = "1";
  private static final String FIGURE2 = "2";
  private static final String FIGURE3 = "3";
  private static final String FIGURE4 = "4";
  private static final String FIGURE5 = "5";
  private static final String FIGURE6 = "6";
  private static final String FIGURE7 = "7";
  private static final String FIGURE8 = "8";
  private static final String AWARD = "40000";
  private static final String AWARD2 = "20000";
  private static final String AWARD3 = "50.6";
  private static final String AWARD4 = "30.0";
  private static final String AWARD5 = "58.7";
  private static final String AWARD6 = "33.2";
  private static final String AWARD7 = "700000";
  private static final String AWARD8 = "300000";  
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
    List<RoomAndRaffleResume> roomAndRaffleResumeList = new ArrayList<>();
    List<RaffleResume> raffleResumeList = new ArrayList<>();
    List<RaffleResume> raffleResumeList2 = new ArrayList<>();

    raffleResumeList.add(new RaffleResume().setId(RAFFLE_ID).setName(RAFFLE_NAME).setState(PENDIENTE).setStateDescription(STATE_DESCRIPTION).setLaunchingDate(RAFFLE_DATE));
    raffleResumeList.add(new RaffleResume().setId(RAFFLE_ID2).setName(RAFFLE_NAME2).setState(PENDIENTE).setStateDescription(STATE_DESCRIPTION2).setLaunchingDate(RAFFLE_DATE2));
    raffleResumeList2.add(new RaffleResume().setId(RAFFLE_ID3).setName(RAFFLE_NAME3).setState(PENDIENTE).setLaunchingDate(RAFFLE_DATE2));
    raffleResumeList2.add(new RaffleResume().setId(RAFFLE_ID4).setName(RAFFLE_NAME4).setState(PENDIENTE).setStateDescription(STATE_DESCRIPTION4).setLaunchingDate(RAFFLE_DATE));
    roomAndRaffleResumeList.add(new RoomAndRaffleResume().setId(ROOM_ID).setName(ROOM_NAME)
        .setDescription(ROOM_DESCRIPTION).setRafflesResume(raffleResumeList));
    roomAndRaffleResumeList.add(new RoomAndRaffleResume().setId(ROOM_ID2).setName(ROOM_NAME2)
        .setDescription(ROOM_DESCRIPTION2).setRafflesResume(raffleResumeList2));

    return new GetRoomsModuleResponse().setRooms(roomAndRaffleResumeList);
  }

  @PostMapping("/getraffles")
  @ResponseBody
  public GetRafflesModuleResponse getBingoRaffles(
      @Valid @RequestBody GetRafflesModuleRequest request) {
    List<FigureAndAward> figureAndAwardList = new ArrayList<>();
    List<FigureAndAward> figureAndAwardList2 = new ArrayList<>();
    List<Raffle> raffleList = new ArrayList<>();

    figureAndAwardList.add(new FigureAndAward().setFigure(FIGURE).setAward(AWARD));
    figureAndAwardList.add(new FigureAndAward().setFigure(FIGURE2).setAward(AWARD2));

    figureAndAwardList2.add(new FigureAndAward().setFigure(FIGURE3).setAward(AWARD3));
    figureAndAwardList2.add(new FigureAndAward().setFigure(FIGURE4).setAward(AWARD4));

    raffleList.add(new Raffle().setId(RAFFLE_ID).setName(RAFFLE_NAME).setState(PENDIENTE).setStateDescripcion(STATE_DESCRIPTION).setRaffleType(GARANTIZADO)
        .setTablePrice(TABLE_PRICE).setMinimunSale(MINIMUM_SALE).setLaunchingDate(RAFFLE_DATE2)
        .setAwards(figureAndAwardList));
    raffleList.add(new Raffle().setId(RAFFLE_ID2).setName(RAFFLE_NAME2).setState(FINALIZADO).setStateDescripcion(STATE_DESCRIPTION2).setRaffleType(PORCENTUAL)
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

    figureAndAwardList.add(new FigureAndAward().setFigure(FIGURE).setAward(AWARD));
    figureAndAwardList.add(new FigureAndAward().setFigure(FIGURE2).setAward(AWARD2));

    figureAndAwardList2.add(new FigureAndAward().setFigure(FIGURE3).setAward(AWARD3));
    figureAndAwardList2.add(new FigureAndAward().setFigure(FIGURE4).setAward(AWARD4));

    figureAndAwardList3.add(new FigureAndAward().setFigure(FIGURE5).setAward(AWARD5));
    figureAndAwardList3.add(new FigureAndAward().setFigure(FIGURE6).setAward(AWARD6));

    figureAndAwardList4.add(new FigureAndAward().setFigure(FIGURE7).setAward(AWARD7));
    figureAndAwardList4.add(new FigureAndAward().setFigure(FIGURE8).setAward(AWARD8));

    raffleList.add(new Raffle().setId(RAFFLE_ID).setName(RAFFLE_NAME).setState(PENDIENTE).setStateDescripcion(STATE_DESCRIPTION).setRaffleType(GARANTIZADO)
        .setTablePrice(TABLE_PRICE).setMinimunSale(MINIMUM_SALE).setLaunchingDate(RAFFLE_DATE2)
        .setAwards(figureAndAwardList));
    raffleList.add(new Raffle().setId(RAFFLE_ID2).setName(RAFFLE_NAME2).setState(FINALIZADO).setStateDescripcion(STATE_DESCRIPTION2).setRaffleType(PORCENTUAL)
        .setTablePrice(TABLE_PRICE2).setMinimunSale(MINIMUM_SALE2).setLaunchingDate(RAFFLE_DATE)
        .setAwards(figureAndAwardList2));

    raffleList2.add(new Raffle().setId(RAFFLE_ID3).setName(RAFFLE_NAME3).setState(INICIADO).setStateDescripcion(STATE_DESCRIPTION3).setRaffleType(PORCENTUAL)
        .setTablePrice(TABLE_PRICE3).setMinimunSale(MINIMUM_SALE3).setLaunchingDate(RAFFLE_DATE)
        .setAwards(figureAndAwardList3));
    raffleList2.add(new Raffle().setId(RAFFLE_ID4).setName(RAFFLE_NAME4).setState(CANCELADO).setStateDescripcion(STATE_DESCRIPTION4).setRaffleType(GARANTIZADO)
        .setTablePrice(TABLE_PRICE4).setMinimunSale(MINIMUM_SALE4).setLaunchingDate(RAFFLE_DATE2)
        .setAwards(figureAndAwardList4));

    roomAndRaffleList.add(new RoomAndRaffle().setId(ROOM_ID).setName(ROOM_NAME).setDescription(ROOM_DESCRIPTION)
        .setRaffles(raffleList));

    roomAndRaffleList.add(new RoomAndRaffle().setId(ROOM_ID2).setName(ROOM_NAME2).setDescription(ROOM_DESCRIPTION2)
        .setRaffles(raffleList2));

    return new GetAllRafflesModuleResponse().setAllRaffles(roomAndRaffleList);
  }
}
