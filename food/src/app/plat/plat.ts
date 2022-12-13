import { Restaurant } from "../restaurant/restaurant";

export interface Plat {
    idPlat: number;
  namePlat: string;
  photo: string;
  pricePlat: number;
  restaurant :Restaurant;
}
