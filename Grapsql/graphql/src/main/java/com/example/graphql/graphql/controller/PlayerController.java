
@Controller
public class PlayerController{
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    @QueryMapping
    public List<Player> findAll() {
        return playerService.findAll();
    }

    public Player getPlayerById(int id) {
        return playerService.findById(id).orElseThrow(() -> new RuntimeException("Player not found"));
    }

    public Player createPlayer(String name, String team) {
        return playerService.create(name, team);
    }

    public Player deletePlayer(int id) {
        return playerService.delete(id);
    }

    public Player updatePlayer(int id, String name, String team) {
        return playerService.update(id, name, team);
    }
}