package com.design.pattern.design_pattern.BehaviroalPattern.Strategy;

public class Navigator {
    Route route;
    Navigator(Route route) {
        this.route = route;
    }

    void navigate() {
        route.buildRoute();
    }
}
