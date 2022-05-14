import {ReactComponent as StarFull} from "assets/img/starfull.svg";
import {ReactComponent as StarHalf} from "assets/img/starhalf.svg";
import {ReactComponent as StarEmpty} from "assets/img/starempty.svg";

import "./styles.css"
type Props = {
  score : number
}

type starProps = {
  fill : number;
}

function getFills(score: number) {

  const fills = [0, 0, 0, 0, 0];

  const integerPart = Math.floor(score);

  for (let i = 0; i < integerPart; i++) {
    fills[i] = 1;
  }

  const diff = score - integerPart;
  if (diff > 0) {
    fills[integerPart] = 0.5;
  }

  return fills;
}


function Star({fill} : starProps)
{
  if(fill === 0)
  {
    return <StarEmpty />
  }
  else if (fill === 1)
  {
    return <StarFull />
  }
  else
  {
    return <StarHalf />
  }
}




function MovieStars( {score} : Props)
{
 const fill = getFills(score);
 return (
    <div className="dsmovie-stars-container">
    <Star fill = { fill[0]} />
    <Star fill = { fill[1]} />
    <Star fill = { fill[2]} />
    <Star fill = { fill[3]} />
    <Star fill = { fill[4]} />
    
  </div>

 );



}

export default MovieStars;