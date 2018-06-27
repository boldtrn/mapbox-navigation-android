package com.mapbox.services.android.navigation.v5.navigation;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

public class NavigationEngineProviderTest {

  @Test
  public void onInitialization_defaultCameraEngineIsCreated() {
    NavigationEngineProvider provider = new NavigationEngineProvider();

    assertNotNull(provider.retrieveCameraEngine());
  }

  @Test
  public void onInitialization_defaultOffRouteEngineIsCreated() {
    NavigationEngineProvider provider = new NavigationEngineProvider();

    assertNotNull(provider.retrieveOffRouteEngine());
  }

  @Test
  public void onInitialization_defaultSnapEngineIsCreated() {
    NavigationEngineProvider provider = new NavigationEngineProvider();

    assertNotNull(provider.retrieveSnapEngine());
  }

  @Test
  public void onInitialization_defaultFasterRouteEngineIsCreated() {
    NavigationEngineProvider provider = new NavigationEngineProvider();

    assertNotNull(provider.retrieveFasterRouteEngine());
  }

  @Test
  public void clearEngines_cameraEngineIsRemoved() {
    NavigationEngineProvider provider = new NavigationEngineProvider();

    provider.clearEngines();

    assertNull(provider.retrieveCameraEngine());
  }

  @Test
  public void clearEngines_offRouteEngineIsRemoved() {
    NavigationEngineProvider provider = new NavigationEngineProvider();

    provider.clearEngines();

    assertNull(provider.retrieveOffRouteEngine());
  }

  @Test
  public void clearEngines_snapEngineIsRemoved() {
    NavigationEngineProvider provider = new NavigationEngineProvider();

    provider.clearEngines();

    assertNull(provider.retrieveSnapEngine());
  }

  @Test
  public void clearEngines_fasterRouteEngineIsRemoved() {
    NavigationEngineProvider provider = new NavigationEngineProvider();

    provider.clearEngines();

    assertNull(provider.retrieveFasterRouteEngine());
  }
}