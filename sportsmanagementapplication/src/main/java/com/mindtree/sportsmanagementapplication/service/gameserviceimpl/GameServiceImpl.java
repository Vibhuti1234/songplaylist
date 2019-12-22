package com.mindtree.sportsmanagementapplication.service.gameserviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.sportsmanagementapplication.dto.GameDto;
import com.mindtree.sportsmanagementapplication.entity.Game;
import com.mindtree.sportsmanagementapplication.entity.Prize;
import com.mindtree.sportsmanagementapplication.entity.Venue;
import com.mindtree.sportsmanagementapplication.exception.NoGamesFoundException;
import com.mindtree.sportsmanagementapplication.exception.NoSuchPrizeExistsException;
import com.mindtree.sportsmanagementapplication.exception.NoSuchVenuePresentException;
import com.mindtree.sportsmanagementapplication.exception.SportsManagementControllerException;
import com.mindtree.sportsmanagementapplication.exception.VenueAlreadyPresentException;
import com.mindtree.sportsmanagementapplication.repository.GameRepository;
import com.mindtree.sportsmanagementapplication.repository.PrizeRepository;
import com.mindtree.sportsmanagementapplication.repository.VenueRepository;
import com.mindtree.sportsmanagementapplication.service.GameService;
@Service
public class GameServiceImpl implements GameService {
	@Autowired
	private VenueRepository venueRepository;
	@Autowired
	private PrizeRepository prizeRepository;
	@Autowired
	private  GameRepository gameRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public String addGame(GameDto game) {
		// TODO Auto-generated method stub
		int c=0;
		
		Game gameEntity = convertDtoToEntity(game);
		List<Prize> prizes=new ArrayList<Prize>();
				prizes=gameEntity.getPrizes();
				for (Prize prize : prizes) {
					System.out.println(prize.getPrizeName());
					
				}
		for (Prize prize : prizes) {
			  prize.setGame(gameEntity);
			prizeRepository.save(prize);
			
		}
		Venue venue=gameEntity.getVenue();
		List<Venue> venues=venueRepository.findAll();
		
		if(venues!=null && venue!=null)
		{
			for (Venue venue2 : venues) {
				if(venue.getVenueName().equals(venue2.getVenueName()))
				{
					c=1;
					break;
				}
				
			}
		}
		if(c==0)
		{   
		    venueRepository.save(venue);
		}
		
		
		
		gameEntity.setPrizes(prizes);
		gameEntity.setVenue(venue);
		gameRepository.save(gameEntity);
		return "Success";
		
	}
	private Game convertDtoToEntity(GameDto game) {
		// TODO Auto-generated method stub
		return modelMapper.map(game, Game.class);
	}
	@Override
	public String addGame(Game gameEntity) throws SportsManagementControllerException {
		// TODO Auto-generated method stub
		int c=0;
		List<Prize> prizes=new ArrayList<Prize>();
		prizes=gameEntity.getPrizes();
		for (Prize prize : prizes) {
			System.out.println(prize.getPrizeName());
			
		}
for (Prize prize : prizes) {
	  prize.setGame(gameEntity);
	
}
Venue venue=gameEntity.getVenue();
List<Venue> venues=venueRepository.findAll();

if(venues!=null && venue!=null)
{
	for (Venue venue2 : venues) {
		if(venue.getVenueName().equals(venue2.getVenueName()))
		{
			c=1;
			break;
		}
		
	}
}
if(c==1)
{  throw new VenueAlreadyPresentException("Venue Already Present:"); 
}
venueRepository.save(venue);



gameEntity.setPrizes(prizes);
gameEntity.setVenue(venue);
gameRepository.save(gameEntity);
/*prizes.stream().forEach(i->prizeRepository.save(i));
*/  
prizes.forEach(i->prizeRepository.save(i));
return "Success";
	}
	@Override
	public List<GameDto> getGamesByVenueName(String venueName) throws SportsManagementControllerException {
		List<Venue> venues=venueRepository.findAll();
		Venue venue=venues.stream().filter(i->i.getVenueName().equals(venueName)).findAny().orElseThrow(()->new NoSuchVenuePresentException("No Such Venue Exists"));
         List<Game> games=venue.getGames();
         if(games.size()==0)
         {
        	 throw new NoGamesFoundException("This Venue Doesnt Have any scheduled game");
         }
         List<GameDto> gameDtos =games.stream().map(gameEntity -> convertEntityToDto(gameEntity)).collect(Collectors.toList());

		return gameDtos;
	}
	private GameDto convertEntityToDto(Game gameEntity) {
		// TODO Auto-generated method stub
		return modelMapper.map(gameEntity, GameDto.class);
	}
	@Override
	public List<GameDto> getGamesByPrizeName(String prizeName) throws SportsManagementControllerException {
		// TODO Auto-generated method stub
		List<Prize> prizeList=new ArrayList<Prize>();

		List<Prize> prizes=prizeRepository.findAll();
	for (Prize prize : prizes) {
		if(prize.getPrizeName().equals(prizeName))
		{
			prizeList.add(prize);
		}
	}
		if(prizeList.size()==0)
		{
			throw new NoSuchPrizeExistsException("No Such Prize Exists");
		}
	    List<Game> games=new ArrayList<Game>();
	    prizeList.forEach(i->games.add(i.getGame()));
        List<GameDto> gameDtos =games.stream().map(gameEntity -> convertEntityToDto(gameEntity)).collect(Collectors.toList());
        return gameDtos;
	}

}
