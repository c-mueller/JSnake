package halive.jsnake.game;

import halive.jsnake.game.core.SnakeGame;
import halive.jsnake.game.menu.MainMenu;
import org.newdawn.slick.state.GameState;

public enum GameStates {
    MAIN_MENU(0, MainMenu.class),
    MAIN_GAME(1, SnakeGame.class);

    private int id;
    private Class<? extends GameState> stateClass;

    GameStates(int id, Class<? extends GameState> stateClass) {
        this.id = id;
        this.stateClass = stateClass;
    }

    public int getID() {
        return id;
    }

    public Class<? extends GameState> getStateClass() {
        return stateClass;
    }
}
