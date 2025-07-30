import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private List<Player> players=new ArrayList<>();
    
    AutomticInteger id=new AtomicInteger(0);

    public List<Player> findAll() {
        return players;
    }

    public Optional<Player> findById(int id) {
        return players.stream().filter(player -> player.getId() == id).findFirst();
    }

    public Player create(String name, String team) {
        Player player = new Player(id.incrementAndGet(), name, team);
        players.add(player);
        return player;
    }
    public Player delete(int id) {
        Optional<Player> playerOpt = players.stream().filter(c->c.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("Player not found"));
        players.remove(playerOpt.get());
        return playerOpt.get();

    }

    public Player update(int id, String name, String team) {
        Player player = players.stream().filter(c -> c.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("Player not found"));
        player.setName(name);
        player.setTeam(team);
        return player;
    } 

    @PostConstruct
    public void init() {
        players.add(new Player(id.incrementAndGet(), "Lionel Messi", "Paris Saint-Germain"));
        players.add(new Player(id.incrementAndGet(), "Cristiano Ronaldo", "Al Nassr"));
        players.add(new Player(id.incrementAndGet(), "Neymar Jr", "Al Hilal"));
        players.add(new Player(id.incrementAndGet(), "Kylian Mbappé", "Paris Saint-Germain"));
        players.add(new Player(id.incrementAndGet(), "Karim Benzema", "Al Ittihad"));
        players.add(new Player(id.incrementAndGet(), "Mohamed Salah", "Liverpool"));
        players.add(new Player(id.incrementAndGet(), "Kevin De Bruyne", "Manchester City"));
        players.add(new Player(id.incrementAndGet(), "Robert Lewandowski", "Barcelona"));
        players.add(new Player(id.incrementAndGet(), "Virgil van Dijk", "Liverpool"));
        players.add(new Player(id.incrementAndGet(), "Sadio Mané", "Al Nassr"));
        players.add(new Player(id.incrementAndGet(), "Son Heung-min", "Tottenham Hotspur"));    
    }
}

