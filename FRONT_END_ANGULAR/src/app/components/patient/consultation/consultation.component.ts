import { Component } from '@angular/core';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap'; // import du modale


@Component({
  selector: 'app-consultation',
  templateUrl: './consultation.component.html',
  styleUrls: ['./consultation.component.css'],
  	// add NgbModalConfig and NgbModal to the component providers
	providers: [NgbModalConfig, NgbModal],
})
export class ConsultationComponent {

  constructor(config: NgbModalConfig, private modalService: NgbModal) {
		// customize default values of modals used by this component tree
		config.backdrop = 'static';
		config.keyboard = false;
	}

	open(content:any) {
		this.modalService.open(content , { size: 'l' }); // pour le modal
	}

}
