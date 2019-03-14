package hello;

import lombok.Getter;

/**
 * @author Kate Novik
 */
@Getter
public class Greeting {
    private final long id;
    private final String content;
    
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}