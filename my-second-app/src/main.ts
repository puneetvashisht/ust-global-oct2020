import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './app/app.module';
import { SurveyModule } from './app/survey/survey.module';

// import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

if (environment.production) {
  enableProdMode();
}

// platformBrowserDynamic().bootstrapModule(SurveyModule)
platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
