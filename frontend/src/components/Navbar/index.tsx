import {ReactComponent as GitHubIcon} from 'assets/img/gitIcon.svg';
import './styles.css'
function Navbar()
{
 return (
 <header>
      <nav className='container'>
        <div className='dsm-nav-content'>
          <h1>DSMovie</h1>
          <a href="https://github.com/leonardo-ssAlencar">
            <div className='dsm-contact-container'>
              <GitHubIcon />
            <p className='dsm-contact-link'>/leonardo.s.s.alencar</p></div>
          </a>
        </div>
      </nav>
    </header>
);

}

export default Navbar;