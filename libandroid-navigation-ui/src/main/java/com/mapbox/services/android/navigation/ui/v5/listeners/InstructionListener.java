package com.mapbox.services.android.navigation.ui.v5.listeners;

import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.services.android.navigation.ui.v5.voice.SpeechAnnouncement;

public interface InstructionListener {

  SpeechAnnouncement willVoice(SpeechAnnouncement announcement);

  BannerInstructions willPresent(BannerInstructions instructions);
}
