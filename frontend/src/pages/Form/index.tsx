import FormCard from "components/FormCard";
import { useParams } from "react-router-dom";


function Form() 
{    
    const param = useParams();
    return ( <FormCard movieId={`${param.movieId}`}/>);

}

export default Form;