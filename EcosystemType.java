package robertd.core_java.common.ecosystem;

public enum EcosystemType {
	UNKNOWN, 			// Used for situitions where the ecosystem is not yet known
	DESERT,				// generic desert (specify desert name or continent)
	ARCTIC,				// Arctic tundra (specify NA, Europe, Greenland, Siberia)
	ANTARCTIC,			// Antarctic shoreline
	SOUTH_PELAGIC_OCEAN, 		// generic open ocean ecosystem (specify Atlantic(N or S), Pacific(N or S), Indian, Arctic or Southern)

	ALPINE, 			// generic mountain (specify mountain range)
	GRASSLANDS,			// generic grasslands
	SAVANNAH, 			// African grasslands
	PRAIRIE, 			// North American grasslands
	WOODLANDS, 			// generic woodlands (specify continent or country)
	CA_JUNGLE, 			// Central American jungle woodlands
	SA_JUNGLE, 			// South American jungle woodlands
	AFRICAN_JUNGLE, 	// African jungle woodlands
	ASIAN_JUNGLE, 		// Southeast Asian (including India) jungle woodlands (specify country)
	WETLANDS,			// generic wetlands like marshes and swamps (specify continent or country)
	BATHIC_OCEAN, 		// generic deep ocean floor (> 5000ft deep) ecosystem (specify Atlantic(N or S), Pacific(N or S), Indian, Arctic or Southern)
	CORAL_REEF,			// generic coral reef ecosystem (specify ocean, continent or specific reef system)
	FRESH_WATER, 		// generic fresh water ecosystem
	DOMESTIC,			// Domesticated animals (should implement Domesticatable)
	VARIOUS;			// For non specific animals that may live in more than one ecosystem

}
