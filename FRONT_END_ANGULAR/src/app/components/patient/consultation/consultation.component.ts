import { Component, OnInit } from '@angular/core';
import { Validators,FormBuilder,FormGroup } from '@angular/forms';
// import { ,Validators } from '@angular/forms';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap'; // import du modale


@Component({
  selector: 'app-consultation',
  templateUrl: './consultation.component.html',
  styleUrls: ['./consultation.component.css'],
  	// add NgbModalConfig and NgbModal to the component providers
	providers: [NgbModalConfig, NgbModal],
})
export class ConsultationComponent implements OnInit {

  constructor(private fb: FormBuilder, config: NgbModalConfig, private modalService: NgbModal) {
		// customize default values of modals used by this component tree
		config.backdrop = 'static';
		config.keyboard = false;
}

consult! : FormGroup;

diagnostique(){
  console.log(this.consult);
}

ngOnInit(): void{
  this.consult =this.fb.group({
    description:['',Validators.required],
    commentaire:['',Validators.required],

  })
}


	open(content:any) {
		this.modalService.open(content , { size: 'l' }); // pour le modal
	}

}
