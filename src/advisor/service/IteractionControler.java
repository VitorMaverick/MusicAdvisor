package advisor.service;

import advisor.model.IUserIteraction;

public class IteractionControler {

    public String getIteraction(IUserIteraction strategy) {
        return strategy.getMessage();
    }
}
