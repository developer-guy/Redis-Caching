package org.redis;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by bapaydin on 10.11.2016.
 */
@Service
public class MusicService {
    @Cacheable(value = "messageCache",condition = "'guitar'.equals(#instrument) or 'trumpet'.equals(#instrument)")
    public String play(final String instrument){
        System.out.println("Executing " + this.getClass().getSimpleName() + ".play(" + instrument + ")" );
        return "paying " + instrument;
    }
}
